# ____        _ _     _       _
#| __ ) _   _(_) | __| |  ___| |_ __ _  __ _  ___
#|  _ \| | | | | |/ _` | / __| __/ _` |/ _` |/ _ \
#| |_) | |_| | | | (_| | \__ \ || (_| | (_| |  __/
#|____/ \__,_|_|_|\__,_| |___/\__\__,_|\__, |\___|
#                                      |___/
# First we build the jar with maven in a fat image with all the tools.
FROM gradle:jdk11-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

# ____                   _
#|  _ \  _____   __  ___| |_ __ _  __ _  ___
#| | | |/ _ \ \ / / / __| __/ _` |/ _` |/ _ \
#| |_| |  __/\ V /  \__ \ || (_| | (_| |  __/
#|____/ \___| \_/   |___/\__\__,_|\__, |\___|
#                                 |___/
FROM build as development
CMD ["gradlew", "bootRun"]

# ____                _       _
#|  _ \ _ __ ___   __| |  ___| |_ __ _  __ _  ___
#| |_) | '__/ _ \ / _` | / __| __/ _` |/ _` |/ _ \
#|  __/| | | (_) | (_| | \__ \ || (_| | (_| |  __/
#|_|   |_|  \___/ \__,_| |___/\__\__,_|\__, |\___|
#                                      |___/
# This stage starts fresh with a minimal debian image and only copying over
# source code.
FROM adoptopenjdk/openjdk11:ubi as prod
RUN mkdir /app

RUN groupadd --gid 1000 java \
  && useradd --uid 1000 --gid java --shell /bin/bash --create-home java
USER java

COPY --from=build /home/gradle/src/build/libs/*.jar /app/MainApplication.jar

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/MainApplication.jar"]

# Expose the port to access the service
EXPOSE 2021