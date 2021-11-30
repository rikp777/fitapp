# ____        _ _     _       _
#| __ ) _   _(_) | __| |  ___| |_ __ _  __ _  ___
#|  _ \| | | | | |/ _` | / __| __/ _` |/ _` |/ _ \
#| |_) | |_| | | | (_| | \__ \ || (_| | (_| |  __/
#|____/ \__,_|_|_|\__,_| |___/\__\__,_|\__, |\___|
#                                      |___/
# First we build the jar with maven in a fat image with all the tools.
FROM gradle:6-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon




## ____                _       _
##|  _ \ _ __ ___   __| |  ___| |_ __ _  __ _  ___
##| |_) | '__/ _ \ / _` | / __| __/ _` |/ _` |/ _ \
##|  __/| | | (_) | (_| | \__ \ || (_| | (_| |  __/
##|_|   |_|  \___/ \__,_| |___/\__\__,_|\__, |\___|
##                                      |___/
#FROM openjdk:6.9.1-jdk17
#EXPOSE 8080
#RUN mkdir /app
#
#COPY --from=build /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar
#
#ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/spring-boot-application.jar"]
#
## Expose the port to access the service
#EXPOSE 7078