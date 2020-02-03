# User polls API 

## 1. Get all user polls 
**Explanation:** API returns all user polls from database
  
**Example:**
```
GET ${HOSTNAME}:${PORT}/userpolls/all
```
## 2. Get user polls filtered by *initiated* field in **datetime** format
**Explanation:** API returns user polls from database that match passed datetime format 

|parameter | value / value format | meaning |
|----|-----|---|    
|**operator**  | eq|equals|
|    | ne |not equals|
|    | gt |grater than|
|    |   gte  |grater than or equals|
|    | lt |less than|
|    | lte |less than equal |
|  **initiated**  | *dd-MM-yyyy-HH:mm:ss.SSS-z* ||

Example:
```
GET ${HOSTNAME}:${PORT}/userpolls/datetimesearch?operator=eq&initiated=24-01-2017-23:09:19.061-UTC
```
*if wrong value is sent for operator or datetime cannot be parsed, API returns all data from db*

## 3. Get user polls filtered by *initiated* field in **date** format
**Explanation:** API returns user polls from database that match passed date format 

| parameter | value / value format | meaning |
|----|-----|---|    
|  **operator**  | eq|equals|
|    | ne |not equals|
|    | gt |grater than|
|    |   gte  |grater than or equals|
|    | lt |less than|
|    | lte |less than equal |
|  **initiated**  | *dd-MM-yyyy* |*value in CET*|

**Example:**
```
GET ${HOSTNAME}:${PORT}/userpolls/datesearch?operator=eq&initiated=24-01-2017
```
*if wrong value is sent for operator or date cannot be parsed, API returns all data from db*

## 4. Get user polls filtered by criteria (text fields search)
**Explanation:** API returns user polls from database that match passed criteria. Criteria can be any indexed text property from document or nested documents. 

| parameter |value format | properties accepted | example |
|----|-----|---|----|   
|  **criteria**  | *property:value*|id|*criteria=locale:fr_CH*|
|    |  |adminKey||
|    |  |type||
|    |  |preferencesType||
|    |  |state||
|    |  |locale||
|    |  |title||
|    |  |optionsHash||
|    |  |device||
|    |  |levels||
|    |  |description||
|    |  |options.text||
|    |  |initiator.name||
|    |  |...||
  
Index created: 
```
[
        {
                "v" : 2,
                "key" : {
                        "_id" : 1
                },
                "name" : "_id_",
                "ns" : "user_polls.polls"
        },
        {
                "v" : 2,
                "key" : {
                        "_fts" : "text",
                        "_ftsx" : 1
                },
                "name" : "UserPolls_TextIndex",
                "ns" : "user_polls.polls",
                "default_language" : "english",
                "weights" : {
                        "_id" : 1,
                        "adminKey" : 1,
                        "description" : 1,
                        "device" : 1,
                        "initiator.additionalProperties" : 1,
                        "initiator.email" : 1,
                        "initiator.name" : 1,
                        "initiator.notify" : 1,
                        "initiator.timeZone" : 1,
                        "levels" : 1,
                        "locale" : 1,
                        "options.additionalProperties" : 1,
                        "options.allday" : 1,
                        "options.available" : 1,
                        "options.date" : 1,
                        "options.dateTime" : 1,
                        "options.end" : 1,
                        "options.endDate" : 1,
                        "options.endDateTime" : 1,
                        "options.start" : 1,
                        "options.startDate" : 1,
                        "options.startDateTime" : 1,
                        "options.text" : 1,
                        "optionsHash" : 1,
                        "participants._id" : 1,
                        "participants.additionalProperties" : 1,
                        "participants.name" : 1,
                        "participants.preferences" : 1,
                        "preferencesType" : 1,
                        "state" : 1,
                        "title" : 1,
                        "type" : 1
                },
                "language_override" : "language",
                "textIndexVersion" : 3
        }
]
```

**Example:**

```
GET ${HOSTNAME}:${PORT}/userpolls/textsearch?criteria=locale:"fr_CH"   
```   
or
```
GET ${HOSTNAME}:${PORT}/userpolls/textsearch?criteria=options.text:"Hulk"   
```
or
```
${HOSTNAME}:${PORT}/userpolls/textsearch?criteria=title:"trip",initiator.name:"John Doe"
``` 