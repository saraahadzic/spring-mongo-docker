FROM mongo

COPY $JSON_FILE_NAME /$JSON_FILE_NAME
CMD mongoimport --host $MONGO_DB_HOST --db $MONGO_DB_NAME --collection $MONGO_DB_COLLECTION --type json --file /$JSON_FILE_NAME --jsonArray --drop
