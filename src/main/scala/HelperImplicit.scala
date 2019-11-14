import java.time.{LocalDate, Month}

object HelperImplicit {

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.length != 3) {
        throw new IllegalArgumentException(f"Number of arguments ${args.length} is incorrect. Should be 3.");
      }
      sc.parts.foreach(
        p => {
          if (!"".equals(p) && !"-".equals(p)) {
            throw new IllegalArgumentException(f"Wrong separator ${p}. Only '-' is allowed.");
          }
        }
      )
      args.foreach(
        arg => {
          if (!isAllDigits(arg.toString)) {
            throw new IllegalArgumentException(f"Arguments should be integer, ${arg} is not");
          }
        }
      )
      LocalDate.of(convertToInt(args(0)), Month.of(convertToInt(args(1))), convertToInt(args(2)))
    }

    private def convertToInt(arg: Any): Int = {
      arg.toString.toInt
    }

    def isAllDigits(x: String): Boolean = x forall Character.isDigit
  }

}
