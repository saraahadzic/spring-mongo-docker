package info.interventure.userpolls.controller;

import info.interventure.userpolls.model.UserPolls;
import info.interventure.userpolls.service.UserPollsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userpolls")
public class UserPollsController {

    @Autowired
    UserPollsService userPollsService;

    @GetMapping(value = "/all")
    public HttpEntity<List<UserPolls>> getAllUserPolls() {
        List<UserPolls> userPolls = userPollsService.findAll();
        if (userPolls.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(userPolls, HttpStatus.OK);
        }
    }


    @GetMapping("/textsearch")
    public Iterable<UserPolls> getUsersByCriteria(@RequestParam("criteria") String searchCriteria) {
        return userPollsService.findUserPollsByCriteria(searchCriteria);
    }

    @GetMapping("/datesearch")
    public Iterable<UserPolls> getUsersByCreationDate(@RequestParam("operator") String operator, @RequestParam("initiated") String initiated) {
        return userPollsService.findUserPollsByCreationDate(operator, initiated);
    }

    @GetMapping("/datetimesearch")
    public Iterable<UserPolls> getUsersByCreationDateTime(@RequestParam("operator") String operator, @RequestParam("initiated") String initiated) {
        return userPollsService.findUserPollsByCreationDateTime(operator, initiated);
    }




}
