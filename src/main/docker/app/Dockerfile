FROM openjdk:8u111-jre
VOLUME /tmp
ADD app.jar /app.jar
ADD wait-for-it.sh /wait-for-it.sh
ADD start.sh /start.sh

ENTRYPOINT ["/wait-for-it.sh","postgres:5432", "--", "/start.sh"]