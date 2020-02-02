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
**Explanation:** API returns user polls from database that match passed criteria. Criteria can be any text file from document or nested documents 

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
  


**Example:**

```
GET ${HOSTNAME}:${PORT}/userpolls/textsearch?criteria=locale:fr_CH   
```   
or
```
GET ${HOSTNAME}:${PORT}/userpolls/textsearch?criteria=options.text:"Hulk"   
```