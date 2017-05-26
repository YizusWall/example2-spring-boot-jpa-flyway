FROM openjdk:8u111-jre-alpine
VOLUME /tmp
ADD yizus-20170525-0.0.1-SNAPSHOT.jar /app.jar
ADD wait-for-it.sh /wait-for-it.sh
ADD start.sh /start.sh
RUN sh -c 'touch /app.jar'

RUN sh -c 'chmod +x /*.sh'

ENTRYPOINT ["/wait-for-it.sh","postgres:5432", "--", "/start.sh"]