package com.aravinth.basic

object LearningScala1 extends App {

  //Variables


  // Immutable variables
  val donutsToBuy : Int = 5

  //Mutable variables
  var favouriteCar : String = "BMW"
  favouriteCar = "Maruti"

  //Lazy initialization

  lazy val carService = "initialize some car service"

  //scala supported variables

  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  //Declare a variable with no initialization

  var carName : String = _
  carName = "Tesla"

  // Using String interpolation to print a variable

  println("Step 1: Using String interpolation to print a variable")
  val favoriteDonut: String = "Glazed Donut"
  println(s"My favorite donut = $favoriteDonut")

//Using String interpolation on object properties
  println("\nStep 2: Using String interpolation on object properties")
  case class Donut(name: String, tasteLevel: String)
  val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
  println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

  //Using String interpolation to evaluate expressions

  println("\nStep 3: Using String interpolation to evaluate expressions")
  val qtyDonutsToBuy: Int = 10
  println(s"Are we buying 10 donuts = ${qtyDonutsToBuy == 10}")

  //Using String interpolation for formatting text

  println("\nStep 4: Using String interpolation for formatting text")
  val donutName: String = "Vanilla Donut"
  val donutTasteLevel: String = "Tasty"
  println(f"$donutName%20s $donutTasteLevel")

  //Using f interpolation to format numbers
  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice1: Double = 2.50
  println(s"Donut price = $donutPrice1")

  println("\nStep 5: Using f interpolation to format numbers")
  val donutPrice2: Double = 2.50
  println(s"Donut price = $donutPrice2")
  println(f"Formatted donut price = $donutPrice2%.2f")


  println("\nStep 6: Using raw interpolation")
  println(raw"Favorite donut\t$donutName")

  //How to escape a Json String

  println("Step 1: How to escape a Json String")
  //val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"


  //Using backslash to escape quotes
  println("\nStep 2: Using backslash to escpae quotes")
  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")

  //Step 4:  Creating multi-line text using stripMargin

  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin

  print(donutJson4)





}
