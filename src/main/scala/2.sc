import java.time.LocalDateTime
import java.time.DayOfWeek

1.isInstanceOf[Any]

class MyClass

val c = new MyClass();

c.isInstanceOf[Any] && c.isInstanceOf[AnyRef]

c.getClass
"Hello".getClass
null.isInstanceOf[AnyRef]

def error(message: String): Nothing =
  throw new RuntimeException(message)

def dayOfWeek: DayOfWeek = {
  val d = LocalDateTime.now().getDayOfWeek
  if (d != DayOfWeek.TUESDAY)
    d
  else
    error("it is TUESDAY")
}

println(dayOfWeek)