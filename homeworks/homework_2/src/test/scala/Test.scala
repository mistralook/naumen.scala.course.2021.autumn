import utest._
import Exercises.Vector2D

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(2, 9) == 3 + 5 + 6 + 9)
            assert(Exercises.sumOfDivBy3Or5(-3, 4) == -3 + 3)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(1) == Seq())
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))

        }
        'test_sumScalars - {
            assert(Exercises.sumScalars(Vector2D(2, 1), Vector2D(4, 5), Vector2D(3, 2), Vector2D(1, 6)) == 28)
            assert(Exercises.sumScalars(Vector2D(-2, 1), Vector2D(4, -5), Vector2D(3, 2.1), Vector2D(0.7, 6)) == 1.700000000000001)
            assert(Exercises.sumCosines(Vector2D(0, 1), Vector2D(1, 0), Vector2D(0, 1), Vector2D(1, 0)) ==
              Exercises.cosBetween(Vector2D(0,1), Vector2D(1, 0)) * 2)
            assert(Exercises.sumCosines(Vector2D(3, 4), Vector2D(1, 3), Vector2D(4, 1), Vector2D(2, 6)) ==
              Exercises.cosBetween(Vector2D(3, 4), Vector2D(1, 3)) + Exercises.cosBetween(Vector2D(4, 1), Vector2D(2, 6)))

        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight() == Seq("Tin",
                "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium", "Uranium", "Gold", "Tungsten",
                "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium",
                "Lithium", "Magnesium", "Potassium", "Graphite"))
            assert(Exercises.sortByHeavyweight(Map(
                "Aluminum" -> (3,   2.6889),
                "Tungsten" ->  (2,   19.35),
                "Tin" ->  (1,   7.29))) == Seq("Tin", "Aluminum", "Tungsten"))
            assert(Exercises.sortByHeavyweight(Map(
                "Firstium" -> (7,   2.6889),
                "Secondium" ->  (3,   100),
                "Thirdium" ->  (4,   7.29))) == Seq("Thirdium", "Firstium", "Secondium"))
            }
    }
}
