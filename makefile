default: cpsc2150/MyVector/*.java
		javac -Xlint cpsc2150/MyVector/*.java

run: cpsc2150/MyVector/*.java
		java cpsc2150.MyVector.IntegerVectorApp

clean:
		rm -f cpsc2150/MyVector/*.class