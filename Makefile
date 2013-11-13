all: clean build
build:
	lein uberjar
	cp `find target -name api-client-*standalone.jar` "api-client.jar"
clean:
	-rm -v *.jar
	rm -rvf target
