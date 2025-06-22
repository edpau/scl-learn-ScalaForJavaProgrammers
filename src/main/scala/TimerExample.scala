def oncePerSecond(callback: ()=> Unit): Unit =
  while true do {
    callback()
    Thread.sleep(1000)
  }

//def timeFlies(): Unit =
//  println("time flies like an arrow...")
//
//@main def Timer: Unit =
//  oncePerSecond(timeFlies)

// Lambda Style
@main def TimerAnonymous: Unit =
  oncePerSecond(() =>
    println("time flies like an arrow"))