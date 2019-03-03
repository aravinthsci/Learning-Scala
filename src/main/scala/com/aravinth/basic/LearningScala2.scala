package com.aravinth.basic

object LearningScala2 extends App{

  //Using if clause as a statement
  println("Step 1: Using if clause as a statement")
  val numberOfPeople = 20
  val donutsPerPerson = 2

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")

  //Using if and else clause as a statement

  println(s"\nStep 2: Using if and else clause as a statement")
  val defaultDonutsToBuy = 8

  if(numberOfPeople > 10)
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  else
    println(s"Number of donuts to buy = $defaultDonutsToBuy")

  //Using if, else if, and else clause as a statement
  println("\nStep 3: Using if, else if, and else clause as a statement")
  if(numberOfPeople > 10) {
    println(s"Number of donuts to buy = ${numberOfPeople * donutsPerPerson}")
  } else if (numberOfPeople == 0) {
    println("Number of people is zero.")
    println("No need to buy donuts.")
  } else {
    println(s"Number of donuts to buy = $defaultDonutsToBuy")
  }

  //. Using if and else clause as expression
  println("\nStep 4: Using if and else clause as expression")
  val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy
  println(s"Number of donuts to buy = $numberOfDonutsToBuy")

  //A simple for loop from 1 to 5 inclusive
  println("Step 1: A simple for loop from 1 to 5 inclusive")
  for(numberOfDonuts <- 1 to 5) {
    println(s"Number of donuts to buy = $numberOfDonuts")
  }

   // A simple for loop from 1 to 5, where 5 is NOT inclusive

    println("\nStep 2: A simple for loop from 1 to 5, where 5 is NOT inclusive")
    for(numberOfDonuts <- 1 until 5){
      println(s"Number of donuts to buy = $numberOfDonuts")
    }

    //Filter values using if conditions in for loop

    println("\nStep 3: Filter values using if conditions in for loop")
    val donutIngredients = List("flour", "sugar", "egg yolks", "syrup", "flavouring")
    for(ingredient <- donutIngredients if ingredient == "sugar"){
      println(s"Found sweetening ingredient = $ingredient")
    }

    //Filter values using if conditions in for loop and return the result back using the yield keyword
    println("\nStep 4: Filter values using if conditions in for loop and return the result back using the yield keyword")
    val sweeteningIngredients = for {
      ingredient <- donutIngredients
      if (ingredient == "sugar" || ingredient == "syrup")
    } yield ingredient
    println(s"Sweetening ingredients = $sweeteningIngredients")

    //Using for comprehension to loop through 2-Dimensional array
    val twoDimensionalArray = Array.ofDim[String](2,2)
    twoDimensionalArray(0)(0) = "flour"
    twoDimensionalArray(0)(1) = "sugar"
    twoDimensionalArray(1)(0) = "egg"
    twoDimensionalArray(1)(1) = "syrup"

    for { x <- 0 until 2
          y <- 0 until 2
    } println(s"Donut ingredient at index ${(x,y)} = ${twoDimensionalArray(x)(y)}")

  //Create a simple numeric range from 1 to 5 inclusive
  println("Step 1: Create a simple numeric range from 1 to 5 inclusive")
  val from1To5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = $from1To5")

  println("\nStep 2: Create a numeric range from 1 to 5 but excluding the last integer number 5")
  val from1Until5 = 1 until 5
  println(s"Range from 1 until 5 where 5 is excluded = $from1Until5")

  println("\nStep 3: Create a numeric range from 0 to 10 but increment with multiples of 2")
  val from0To10By2 = 0 to 10 by 2
  println(s"Range from 0 to 10 with multiples of 2 = $from0To10By2")


  println("\nStep 4: Create an alphabetical range to represent letter a to z")
  val alphabetRangeFromAToZ = 'a' to 'z'
  println(s"Range of alphabets from a to z = $alphabetRangeFromAToZ")

  println(s"\nStep 5: Character ranges with user specified increment")
  val alphabetRangeFromAToZBy2 = 'a' to 'z' by 2
  println(s"Range of every other alphabet = $alphabetRangeFromAToZBy2")

  println("\nStep 6: Storing our ranges into collections")
  val listFrom1To5 = (1 to 5).toList
  println(s"Range to list = ${listFrom1To5.mkString(" ")}")

  val setFrom1To5 = (1 to 5).toSet
  println(s"Range to set = ${setFrom1To5.mkString(" ")}")

  val sequenceFrom1To5 = (1 to 5).toSeq
  println(s"Range to sequence = ${sequenceFrom1To5.mkString(" ")}")

  val arrayFrom1To5 = (1 to 5).toArray
  println(s"Range to array = `${arrayFrom1To5.mkString(" ")}")

  arrayFrom1To5.foreach(print(_))

  //How to use while loop in Scala

  println("Step 1: How to use while loop in Scala")
  var numberOfDonutsToBake = 10
  while (numberOfDonutsToBake > 0) {
    println(s"Remaining donuts to be baked = $numberOfDonutsToBake")
    numberOfDonutsToBake -= 1
  }

  //How to use do while loop in Scala

  println("\nStep 2: How to use do while loop in Scala")
  var numberOfDonutsBaked = 0
  do {
    numberOfDonutsBaked += 1
    println(s"Number of donuts baked = $numberOfDonutsBaked")
  } while (numberOfDonutsBaked < 5)

  //Pattern matching 101 - a very basic example
  println("Step 1: Pattern matching 101 - a very basic example")
  val donutType = "Glazed Donut"
  donutType match {
    case "Glazed Donut" => println("Very tasty")
    case "Plain Donut" => println("Tasty")
  }

  //Pattern matching and return the result

  println("\nStep 2: Pattern matching and return the result")
  val tasteLevel = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel")


  //Pattern matching using the wildcard operator
  println("\nStep 3: Pattern matching using the wildcard operator")
  val tasteLevel2 = donutType match {
    case "Glazed Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel2")

  //Pattern matching with two or more items on the same condition


  println("\nStep 4: Pattern matching with two or more items on the same condition")
  val tasteLevel3 = donutType match {
    case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel3")

  //Pattern matching and using if expressions in the case clause


  println("\nStep 5; Pattern matching and using if expressions in the case clause")
  val tasteLevel4 = donutType match {
    case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
    case "Plain Donut"  => "Tasty"
    case _  => "Tasty"
  }
  println(s"Taste level of $donutType = $tasteLevel4")

  //Pattern matching by types
  println("\nStep 6: Pattern matching by types")
  val priceOfDonut: Any = 2.50
  val priceType = priceOfDonut match {
    case price: Int => "Int"
    case price: Double => "Double"
    case price: Float => "Float"
    case price: String => "String"
    case price: Boolean => "Boolean"
    case price: Char => "Char"
    case price: Long => "Long"
  }
  println(s"Donut price type = $priceType")

  // Using Tuple2 to store 2 data points

  println("Step 1: Using Tuple2 to store 2 data points")
  val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
  println(s"Glazed Donut with 2 data points = $glazedDonutTuple")

  //Access each element in tuple

  println("\nStep 2: Access each element in tuple")
  val donutType1 = glazedDonutTuple._1
  val donutTasteLevel = glazedDonutTuple._2
  println(s"$donutType1 taste level is $donutTasteLevel")

  println("\nStep 3: Using TupleN classes to store more than 2 data points")
  val glazedDonut = Tuple3("Glazed Donut", "Very Tasty", 2.50)
  println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")
  println("\nStep 4: How to use pattern matching on Tuples")
  val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
  val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
  val donutList = List(glazedDonut, strawberryDonut, plainDonut)


  val priceOfPlainDonut = donutList.foreach { tuple => {
    tuple match {
      case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
      case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
      case _ => None
    }
  }

   //How to use Option and Some - a basic example

    println("Step 1: How to use Option and Some - a basic example")
    val glazedDonutTaste: Option[String] = Some("Very Tasty")
    println(s"Glazed Donut taste = ${glazedDonutTaste.get}")

    //How to use Option and None - a basic example
    println("\nStep 2: How to use Option and None - a basic example")
    val glazedDonutName: Option[String] = None
    println(s"Glazed Donut name = ${glazedDonutName.getOrElse("Glazed Donut")}")

    // How to use Pattern Matching with Option
    println("\nStep 3: How to use Pattern Matching with Option")
    glazedDonutName match {
      case Some(name) => println(s"Received donut name = $name")
      case None       => println(s"No donut name was found!")
    }
    glazedDonutTaste.map(taste => println(taste))

    println("Step 1: Declare a variable of type Any")
    val favoriteDonut: Any = "Glazed Donut"
    println(s"favoriteDonut of type Any = $favoriteDonut")

    println("\nStep 2: Declare a variable of type AnyRef")
    val donutName: AnyRef = "Glazed Donut"
    println(s"donutName of type AnyRef = $donutName")


    println("\nStep 3: Declare a variable of type AnyVal")
    val donutPrice: AnyVal = 2.50
    println(s"donutPrice of type AnyVal = $donutPrice")

    

  }






}
