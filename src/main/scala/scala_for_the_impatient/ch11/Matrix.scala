package scala_for_the_impatient.ch11

import org.apache.commons.math3.linear.Array2DRowRealMatrix

class Matrix(private val matrix: Array[Array[Int]]) {

  def +(other: Matrix): Matrix = {
    if (matrix.length != other.matrix.length) {
      throw new IllegalArgumentException("+ is for the matrix of the same dimension")
    }
    val ret: Array[Array[Int]] = new Array[Array[Int]](matrix.length)
    for (i <- matrix.indices) {
      ret(i) = matrix(i).zip(other.matrix(i)).map(x => x._1 + x._2)
    }
    Matrix(ret)
  }

  def *(other: Matrix): Matrix = {
    val first = new Array2DRowRealMatrix(matrix
      .map(arr => arr
        .map(a => a.toDouble)))
    val second = new Array2DRowRealMatrix(other.matrix
      .map(arr => arr
        .map(a => a.toDouble)))
    Matrix(first.multiply(second).getData
      .map(arr => arr
        .map(a => a.toInt))
    )
  }

  def *(factor: Int): Matrix = {
    Matrix(
      matrix
        .map(arr => arr
          .map(a => a * factor))
    )
  }

  def apply(row: Int, col: Int): Int = {
    matrix(row)(col)
  }

  override def toString: String = matrix.map(_.mkString(" ")).mkString("\n")
}

object Matrix {
  def apply(matrix: Array[Array[Int]]): Matrix = new Matrix(matrix)
}
