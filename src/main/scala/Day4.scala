import Day4.Row
import scala.quoted.runtime.Patterns.patternType
object Day4 {

  val myInput = """
    31,50,68,16,25,15,28,80,41,8,75,45,96,9,3,98,83,27,62,42,59,99,95,13,55,10,23,84,18,76,87,56,88,66,1,58,92,89,19,54,85,74,39,93,77,26,30,52,69,48,91,73,72,38,64,53,32,51,6,29,17,90,34,61,70,4,7,57,44,97,82,37,43,14,81,65,11,22,5,36,71,35,78,12,0,94,47,49,33,79,63,86,40,21,24,46,20,2,67,60

95 91 54 75 45
46 94 39 44 85
31 43 24  2 70
90 58  4 30 77
13 26 38 52 34

68 14 99 63 46
67 16 82 10  8
55 52 41 51  4
90 17 32 44 74
89 94 73 56 36

 6 91  2 28 71
 7 88 37 21 36
95 32 84 57  8
13 79 89 75 48
47 81 66 17  5

44 55 48 16 41
35  5 43 53 11
 0 79 19 82 49
30 85 31 72 39
27 68 65 66 95

 6 46 55 24 40
87 16 62 11 64
 8 49 18 59 91
72 28 48 19 96
39 73  9 88  0

46  1 18 93  6
50 96 41 81 58
62 66 49 32 55
29 11 65  2 10
71 30 17 69 43

84 57  6 56 95
39 15 32  1 10
55 43 40  3 22
89 54 13 80 38
72 12 59 71 77

 3 51 72 88  6
56 64 99 82 36
75 81 42 67 24
41 79 35 40 73
 2 14 61 50 87

72  7  0 99 24
29 81 92 74 38
84 53 20 56 91
93 64 44 48  2
37 40 88 96 97

39 87 99 75 38
45 81 46 72 62
40  8 24 67 79
96  1 77 73 70
34 13 55 83 59

18 38 55 84 58
35 97 31 26 44
80  1 28 71 85
45 46 10 32 99
60 48 72 11 53

53 44  6 30 82
65 64 10  0 86
81 50  5 21 60
16 19 97 66 73
20 24 96 68 69

33 85 88 58 20
19  2 99 40 70
69 10 17 67 23
48  9 29 34  3
89 30 43 41 94

30 83 37 14 78
57 42 98 90 28
 5 82 51 15 55
77 79 96 67 53
22 76  0 59 47

10 93 84 54 11
59 30  6 94 75
 9 62 68 37 24
61  3 66 58 74
64  0 83 32 13

24 77 15  5 49
23 11 70 17 10
62 33 38 36 12
 3 61  0 26 65
63 47 54 50  9

34 28 24 55 38
69 37 36 32 72
91 85  9 64 68
94 22 96 90 82
30 20 97 19 56

35 90 58 93  2
72  8 27 88 16
25 54 69 60 61
 1 15  9 71 78
89 42 46 57 91

43 38 47  1 82
19 32  2 95 51
78 74 91 10 22
80 77 33 60 14
 0 98 70 54 50

71 94  3 84 31
10 59 12 28 46
68 69 13 48 36
37 49 24 26 61
72 65 38 16 25

68 78 10 90 29
40 14 45 43 44
27 75 72 39 87
96 93 53 12 11
37 64 56 59 76

19 78 84 68 41
36 96 87 15 55
47 33 10 91 85
11 94 31 49 35
83 63 86  4 76

 5 89 55 46 96
67 22 95 82 56
61 94 84 99 28
71 70 16 57 63
98 92 86 73 83

56 24 93 88 29
74 89 50 44 79
97 49 87 31  8
70  6 57  3 82
20 25 99 48 78

80 20 45 22 57
43 35 48 44 52
29 98 38 27 11
64 49 84 60 31
 7 97 17 85 74

21  1 18 41 62
76 38 13 46 27
 0 16 43 28 53
54 42 22 83 20
 4 25 50 11 56

21 71 73 30 51
92 27 14 16 11
89 43 38 62 31
65  4 36 84 94
56 13 59 22  6

46 28 45 57  6
16 67 33 20 44
36 86 92  3 11
98 27 26 84 31
 5 76 13 65 25

49 55 99 31 73
80  0 83 26 65
 3 96 60 37 50
57 34  7 20 23
70 52 93 13 71

78 41 81 32 76
37 36 16 99 48
 3 93 33 85 35
60 38 74 80 56
86 29 87 20  7

98 24  4  9 82
22 37 52 81 30
51 70 17 23  8
60 61 75 35 85
33 48 88 13 57

49 52 91 21 46
90 51 70  5 35
57 68 31 86 87
42 36 25 95  3
73 64 17 96 80

 6 42 13 16 24
51 72 55 78 47
67 28  7 97 64
44 77 98 71 25
82  8 31 76 73

63 79 18 80 27
57 66 47 89 14
15 61 94 38 29
21 53 73 17 76
65  7 23 36  3

93 22  8 52  4
63 31 90 46 68
51 14 95 50 23
17 34 60 75 36
88 55  7  0 73

42 67 91 15 83
 1 37 76 12 25
29 82 50 70 86
74 66 39 90 16
31 71 47  5 92

98 48 27 87  2
60  0 25 30 14
44 61 94 82 16
17 19 53 49 59
15 85 50 63  8

63 12 52 81 97
87 68 44 31 41
39 24 99 27  6
 1 21 35 59 51
 4 92  3 90 62

66 43 98 25 47
59 16 75 44 82
40 58 48 60 37
13 81 61 45 83
24 89 93 19 67

 8 86 47 81 83
 1 91 57 59 68
 0 52 25 93 95
27 84 63 45 36
39 62 20 99 88

67 28 65  4 17
44 33 12 99 84
27 36 34  5 10
38 63 97 82 64
94 19 58 41  6

28 41 96 16 39
93 78 56 69 75
74 60  9 30  7
12 81 35 84 94
45 20  6 49  2

33  7  5 43  9
97 65 50  2  1
26 86 76 47 98
83 31 30 58 52
93 51 34 63 12

65 81 10 46 59
51 89 85  2 52
13 54 18 70  4
37 94 75 92 56
58 99 91 32 41

44 23 18 16 75
 5  3 45 76 90
20 71 69 37 99
49 91 43 32 82
 4 79 51  2 39

54 80 71 61 76
81 52  6 89 34
58 14 20 26 40
25 60 45  0  3
36 33 65 41 94

53 23 56 55 92
 3 81 59  0 35
32 30 93 70 40
45 91 24 65  6
95 88 16 47  8

24 23 10 47 63
38 79 18 77 62
13 88 72 68 36
96 27 12 69 89
28 94  6 98 20

70  1 61 77 28
92 22 30 48 96
66  3 34 29 45
85  6 17 87  5
97 89 14 80 20

40 86 97  5 54
91 57 12 19  7
62 88 92 20 32
50 77 11 39 22
33  2 21 95 35

51 79 64 24 28
95 19 82 58 76
69 30  9 14 42
27 16 56 80 83
52  5 49 43 45

26 65 68 18 55
58 83 30 48  4
69 42 78 96 22
91 13 82 38 41
67 33 10 98 53

74 97 43  1 18
49 30 28 10 15
42 12 80 20 96
41 92 67 22 36
 5 26 13 47  4

85 60 72 19 48
61 21 43 34 83
51 75 94 11 78
27 89 45 49 79
97 15  5 28 50

69 99 97 77 98
37 80 86  7 34
85 28 31 23 16
32 47  8 40  4
46 91 71 54 74

23 43 29  7 21
58 34 42  4 38
64 96 16 73 49
36 92 52 81 31
85 71 78 13  5

65 71 46  5 11
24  4  6  0 23
13 17 76 15 34
27 79 10 56 85
90 19 30 94 78

81 40 65 12 35
23 93 24 96 53
27 60 87 59 33
76 56  4 17  6
78 49 90  3 80

 7 25 42 85 39
40  6 26 11 63
48 20 62 61 89
78 15 18 21 53
69  4 87 47  5

38 65 87 72 26
88 75 10 30  3
89 58  7 20 32
85  2 97 63 15
28 77 82 57 64

16 89  6 31 27
45 69 61  5 15
40 75 64 94 98
36 18 26 58 90
10 44 59 13 67

80 13 39 49 42
50 94 12 14 88
97 48 15 68 69
21 18 51 99 91
89 64 35 63 84

81 96 26 43 30
 5 74  9 93 60
63 41  1 14 22
 4 77 33 53  3
38 90 50 25 10

58 66 17  0 16
 5 67 41 48 40
43 93 76 95 68
 4 13 14 51  8
56 74 23 57 94

18 15 92  4 20
69 26 84 23  2
72 35 56 96  9
61 41 85 91 25
13 70  1 14 77

15 20 77 80 47
45 34 63 55 75
65 12 66 44 22
74  3 25 38 93
 9 31 68 87 67

54 95 79 50 75
18 36 20 34 43
17 65 55 98 61
27 46 56  6 52
91 31 30 40  0

25 30 24 64 98
 8 72 53 45  3
27 77  0 33 44
89 39 34 71 38
54 21 20 80 23

69 38 63 60  4
55 37 83 68 61
67 25 86 24 18
22 59 65 28 70
84 46 44 91 96

35 27 65 31  0
46 97 44 74  4
56 61  7 49 88
 5 38 50 20 26
62  9 45 64 51

 3 28 43 97  7
88 57 17 82 73
16 94 74 22 39
84 99 31  1 47
92 91 55 38 78

60 31 29 49 72
89 41  5 79 22
58 28 90 76 95
93 45 14 47 37
65 25  7 59 62

58  1 73 30 55
95 46  5 80 63
52 16 70 20 71
84 60 15  0 77
99 89 17 72 31

83 21 68 18 42
 1 28 97 31 35
 2 38 67 63 74
77 27 48 90 86
12 52 26 29 60

81 53 80 85 96
19 32 31 15 88
91 92 66 37 34
74 75 33 39 78
42 40 30 83 58

40 41 80 69 67
24 63 97 33  5
28 84 34 72 11
36 79 91 14 92
55 89 59 10 44

 0 51 49 24 60
48 65 28 70 66
86 58 78 77 18
 6 44 50 37 36
 4 73 91 97 43

66 42 76 12 48
77 83 35 18 50
30 87 95 99 11
 0 52 92 16 51
26 56 39 64 62

83 89 52 61 45
74 77 66 59 30
85 17 38 10  8
97 67 54 21 26
34 63 11 94 40

93 91 14 49 38
77 53 29 36 39
12 52  0 48 92
95 82 71 76 37
19 70 75  9 74

80 49 59 67 27
43 66 97 81 12
10 77 24 75 68
16 57 14 28 85
41 52 23 15  2

39 89 66 27 11
63 84 21 44 69
56 51 58 70 83
14  0  8 41 31
98 18 61 97 74

97 18 63 29 24
75 73 80  8  7
81 37 46 93 68
57 32  2 41  5
 4 65 88 45 54

87 26 81 12 50
19  9 68 23 71
74 38  4 34 16
18 99 86 45  7
35  8 11 98 57

13 31 78 59 58
51 61 96 68 44
41 85 26 55 92
11 62 30  7 64
18 19 73 27 17

48 85 71 39 29
33 79 24  0 72
95 52 12 77 40
70 31 46 44 43
61 88 73 49 65

60 81 51 24 27
23 28 47 85 67
35 57 45 76 84
19 48 30 37 74
15 78 56 87 16

12  5 45 26 21
 1 71 51 10 25
37 68 73 46 56
55 20 63 87 91
22 32 66 90 19

20 59 12 29 97
92 30 77 27 49
14 98 23 50  6
11 47 61 34 36
55 82 13 22 21

29 37  0 40 71
 2 43 97 18 59
32 72 89 99 24
58 90 73 60 85
69 53 95 78 27

58 28 32 52 55
86 33  1 41 60
 8 53 42 92  5
43 69 96 54 24
74 10 17 89 85

51 74 99 21 64
54 27 60 32 37
14 45 50 81 94
28 11 77 17 23
93 95 53 57 79

16  5 80 45 71
22 57  9 90 43
 3 52 47 59 84
28 53 14 15  7
50 76 46 56 34

83 62 77 56 26
82 35 11  6 51
96 97 15  1 78
92 45 55 84 94
20  8 70 21 31

 4 47 68 81 12
66 23 35  8 39
73 94 27 69 22
59 11 53 26 99
 7 20 87 60 88

90  0 88 81 43
47 54 42 29 97
60 13 85 51 71
56 14 94 80 41
75  8 35 69 61

51 38 40 17 42
19 26 92 64 67
33 66 82 27 55
62  2 68 59 31
 7 24 20 91 79

21 83 45 35 88
85 11  5 86 72
78  3 58  0 89
67  1 39 59 63
79 87 19  4 57

25 16 40 17 27
96 72 29 32 87
50 63 35 81 66
 7 11 92 68 69
54 83 12 51 95

64 98 67 54 75
 8 10 31  5 57
89 23 25 34 47
72 74 37 48 94
39 59 15 55 87
"""

    val exampleInput = """
    7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1

22 13 17 11  0
 8  2 23  4 24
21  9 14 16  7
 6 10  3 18  5
 1 12 20 15 19

 3 15  0  2 22
 9 18 13 17  5
19  8  7 25 23
20 11 10 24  4
14 21 16 12  6

14 21 17 24  4
10 16 15  9 19
18  8 23 26 20
22 11 13  6  5
 2  0 12  3  7
 """

  def dayFourFirst = {
    val (drawList, tables) = processInput(
      myInput.replaceAll("\r\n", "\n").split("\n").toList,
      List.empty,
      List.empty
    )
    playTheNormalGame(drawList, tables)
  }

  def dayFourSecond = {
    val (drawList, tables) = processInput(
      myInput.replaceAll("\r\n", "\n").split("\n").toList,
      List.empty,
      List.empty
    )
    playTheReversedGame(drawList, tables)
  }

  case class Number(value: Int, check: Boolean)
  type Row = List[Number]
  case class Table(rows: List[Row])
  type DrawList = List[Int]

  def playTheReversedGame(drawList: DrawList, tables: List[Table]): Int = {
    drawList.headOption match {
      case Some(draw) => {
        val tablesCheckedWithDraw = checkTheNumberOnTables(tables, draw)
        val winnerTable = tablesCheckedWithDraw.filter(isTableWon(_))
        if (winnerTable.length == 1 && tables.length == 1) {
           draw * getValueOfTable(winnerTable.head, false)
        } else if (winnerTable.isEmpty) {
          playTheReversedGame(drawList.tail, tablesCheckedWithDraw)
        } else {
          playTheReversedGame(drawList.tail, tablesCheckedWithDraw.diff(winnerTable))
        }
      }
      case None => ???
    }
  }

  def playTheNormalGame(drawList: DrawList, tables: List[Table]): Int = {
    drawList.headOption match {
      case Some(draw) => {
        val tablesCheckedWithDraw = checkTheNumberOnTables(tables, draw)
        val winnerTable = tablesCheckedWithDraw.filter(isTableWon(_))
        if (winnerTable.isEmpty) {
          playTheNormalGame(drawList.tail, tablesCheckedWithDraw)
        } else {
          draw * getValueOfTable(winnerTable.head, false)
        }
      }
      case None => ???
    }
  }

  def getValueOfTable(table: Table, checked: Boolean, acc: Int = 0): Int = {
    def helper(rows: List[List[Number]], acc: Int): Int = rows match {
      case Nil => acc
      case row :: remainingRows =>
        val (updatedRow, rowSum) = row.foldLeft((List.empty[Number], 0)) {
          case ((updatedNumbers, sum), number) =>
            if (number.check == checked) {
              (
                Number(number.value, !checked) :: updatedNumbers,
                sum + number.value
              )
            } else {
              (number :: updatedNumbers, sum)
            }
        }
        helper(remainingRows, acc + rowSum)
    }
    helper(
      table.rows,
      acc
    )
  }

  def checkTheNumberOnTables(tables: List[Table], draw: Int): List[Table] = {
    tables.map(table =>
      Table(
        table.rows.map(row =>
          row.map(number => {
            if (number.value == draw) {
              Number(number.value, true)
            } else {
              number
            }
          })
        )
      )
    )
  }

  def isTableFull(table: Table): Boolean = table.rows.length == 5

  def isTableWon(table: Table): Boolean = {
    val isRowWon = table.rows.filter(_.filter(_.check).length == 5).length > 0
    def isColumnWon(partialTable: Table): Boolean = {
      if (partialTable.rows.head != List()) {
        if (partialTable.rows.filter(_.head.check).length == 5) {
          true
        } else {
          isColumnWon(Table(partialTable.rows.map(_.tail)))
        }
      } else {
        false
      }
    }
    isRowWon || isColumnWon(table)
  }

  def processInput(
      input: List[String],
      drawList: DrawList,
      tables: List[Table]
  ): (DrawList, List[Table]) = {
    input.headOption match
      case Some(draws) if draws.contains(",") =>
        processInput(
          input.tail,
          draws.split(",").map(_.trim.toInt).toList,
          tables
        )
      case Some(line) if line.trim.isEmpty() =>
        processInput(
          input.tail,
          drawList,
          tables
        )
      case Some(line) => {
        val numbers = line.split(" ").filter(!_.isEmpty).map(_.trim.toInt)
        if (isTableFull(tables.headOption.getOrElse(Table(List.empty)))) {
          processInput(
            input.tail,
            drawList,
            List(
              Table(List(numbers.toList.map(value => Number(value, false))))
            ) ++ tables
          )
        } else {
          val currentTable = tables.headOption match
            case Some(value) => value.rows
            case None        => List.empty
          val readyTables = if (tables.isEmpty) {
            List.empty
          } else {
            tables.tail
          }
          processInput(
            input.tail,
            drawList,
            List(
              Table(
                currentTable ++
                  List(
                    numbers.toList.map(value => Number(value, false))
                  )
              )
            ) ++ readyTables
          )
        }
      }
      case None => (drawList, tables)
  }

}
