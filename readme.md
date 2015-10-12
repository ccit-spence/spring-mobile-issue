MySQL Docker container for the database.

docker run -d -p 3306:3306 --name cc-mysql -e MYSQL_DATABASE=cc-mysql -e MYSQL_USER=ccuser -e MYSQL_PASSWORD=ccpassword -e MYSQL_ROOT_PASSWORD=root -d mysql:5.6.27