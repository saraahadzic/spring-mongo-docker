package info.interventure.userpolls.service;

import info.interventure.userpolls.model.UserPolls;

import java.util.List;

public interface UserPollsService {


    List<UserPolls> findAll();

    Iterable<UserPolls> findUserPollsByCriteria(String searchCriteria);

    Iterable<UserPolls> findUserPollsByCreationDate(String operator, String initiated);

    Iterable<UserPolls> findUserPollsByCreationDateTime(String operator, String initiated);
}
