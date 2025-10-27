.PHONY: build run run-dist clean test check

build:
	./gradlew build

run:
	./gradlew run

run-dist:
	./gradlew installDist
	./build/install/app/bin/app

clean:
	./gradlew clean

check:
	./gradlew checkstyleMain
