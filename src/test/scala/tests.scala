import org.scalatest.{BeforeAndAfter, FunSuite}

class TextInputTest extends FunSuite with BeforeAndAfter {

  test("Throws Exception") {
    val number = "test".toLong
    Main.output(number)
  }
  assertThrows[NumberFormatException]
}

class ZeroNumberTest extends FunSuite with BeforeAndAfter {

  test("Long Output") {

    assert(Main.output(0) == "zero")
  }
  test("Short Output") {

    assert(Main.output(0)  == "zero")
  }
}


class NegativeNumberTest extends FunSuite with BeforeAndAfter {


  test("Long Output") {

    assert(Main.output(-1268934) == "negative one million two hundred sixty eight thousand nine hundred thirty four")
  }
  test("Short Output") {

    assert(Main.output(-1268934)  == "negative one million two hundred sixty eight thousand nine hundred thirty four")
  }

}

class ReallySmallNumberTest extends FunSuite with BeforeAndAfter {


  test("Long Output") {

    assert(Main.output(47) == "fourty seven")
  }
  test("Short Output") {

    assert(Main.output(47)  == "fourty seven")
  }

}

class SmallNumberTest extends FunSuite with BeforeAndAfter {


  test("Long Output") {

    assert(Main.output(1325) == "one thousand three hundred twenty five")
  }
  test("Short Output") {

    assert(Main.output(1325)  == "one thousand three hundred twenty five")
  }

}

class MediumNumberTest extends FunSuite with BeforeAndAfter {

  test("Long Output") {
    assert(Main.output(75262734035L) == "seventy five milliard two hundred sixty two million seven hundred thirty four thousand thirty five")
  }
  test("Short Output") {
    val shortScalee = Main.output(75262734035L).replaceAll("billion", "trillion").replaceAll("milliard", "billion")
    assert(shortScalee == "seventy five billion two hundred sixty two million seven hundred thirty four thousand thirty five")
  }
}

class LongNumberTest extends FunSuite with BeforeAndAfter {



  test("Long Output") {
    assert(Main.output(262373452329L) == "two hundred sixty two milliard three hundred seventy three million four hundred fifty two thousand three hundred twenty nine")
  }
  test("Short Output") {
    val shortScalee = Main.output(262373452329L).replaceAll("billion", "trillion").replaceAll("milliard", "billion")
    assert(shortScalee == "two hundred sixty two billion three hundred seventy three million four hundred fifty two thousand three hundred twenty nine")
  }
}


