package info.interventure.userpolls.service;

import info.interventure.userpolls.model.UserPolls;
import info.interventure.userpolls.repo.UserPollsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static info.interventure.userpolls.constants.AllConstants.DATE_FORMAT;
import static info.interventure.userpolls.constants.AllConstants.DATE_TIME_FORMAT;


@Service
public class UserPollsServiceImpl implements UserPollsService {


    @Autowired
    private UserPollsRepo userPollsRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<UserPolls> findAll() {
        return userPollsRepo.findAll();
    }


    @Override
    public Iterable<UserPolls> findUserPollsByCriteria(String searchCriteria) {
        TextCriteria criteria = TextCriteria.forDefaultLanguage().matching(searchCriteria);
        TextQuery query = TextQuery.queryText(criteria);

        return mongoTemplate.find(query, UserPolls.class);
    }


    @Override
    public Iterable<UserPolls> findUserPollsByCreationDateTime(String operator, String initiated) {
        try {

            SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_FORMAT);
            Date date = (Date) formatter.parse(initiated);
            Query query = null;

            switch (operator) {
                case "gt": {

                    query = new Query(Criteria.where("initiated").gt(date));
                    break;
                }
                case "gte": {

                    query = new Query(Criteria.where("initiated").gte(date));
                    break;
                }
                case "le": {
                    query = new Query(Criteria.where("initiated").lt(date));
                    break;
                }
                case "lte": {
                    query = new Query(Criteria.where("initiated").lte(date));
                    break;
                }
                case "eq": {
                    query = new Query(Criteria.where("initiated").is(date));
                    break;
                }
                case "ne": {
                    query = new Query(Criteria.where("initiated").ne(date));
                    break;
                }
                default: {


                }

            }

          return mongoTemplate.find(query, UserPolls.class);


        } catch (ParseException e) {
            return userPollsRepo.findAll();
        }
    }

    @Override
    public Iterable<UserPolls> findUserPollsByCreationDate(String operator, String initiated) {
        try {

            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            Date date = (Date) formatter.parse(initiated);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date nextDay=c.getTime();

            Query query = null;

            switch (operator) {
                case "gt": {
                    query = new Query(Criteria.where("initiated").gte(nextDay));

                    break;
                }
                case "gte": {

                    query = new Query(Criteria.where("initiated").gte(date));
                    break;
                }
                case "lt": {
                    query = new Query(Criteria.where("initiated").lt(date));
                    break;
                }
                case "lte": {

                    query = new Query(Criteria.where("initiated").lt(nextDay));
                    break;
                }
                case "eq": {
                    query = new Query(new Criteria().andOperator(Criteria.where("initiated").gte(date),Criteria.where("initiated").lt(nextDay)));
                    break;
                }
                case "ne": {
                    query = new Query(new Criteria().orOperator(Criteria.where("initiated").lt(date),Criteria.where("initiated").gte(nextDay)));
                    break;
                }
                default:
                    return userPollsRepo.findAll();


            }

           return mongoTemplate.find(query, UserPolls.class);


        } catch (ParseException e) {
            return userPollsRepo.findAll();
        }


    }
}
