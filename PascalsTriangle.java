/**
 * Pascal's Triangle
 * @author Jeffrey Wang
 * @license - may be used for educational purposes ONLY, excluding editing of this code
*/
import java.math.*;
import java.io.*;
import java.util.*;

public static void main ( String[] args ) {
  Scanner s = new Scanner ( System.in );
  System.out.println ( "Pascal's Triangle" );
  System.out.println ( "n = " );
  int n = s.nextInt();
  PascalsTriangle pt = new PascalsTriangle( n );
  pt.toString();
}

class PascalsTriangle {
  int[][] grid;
  public PascalsTriangle ( int n ) {
    grid = new int[n][n];
    for ( int[] irow : grid ) {
      for ( int icol : irow ) {
        icol = 0;
      }
    }
    this.ptgen ( n );
  }
  public void ptgen ( int n ) {
    grid[0][0] = 1;
    this.ptrow ( 1, n );
  }
  public void ptrow ( int start, int end ) {
    if ( start == end ) {
      // nothing much
    } else {
      grid[start][0] == 1;
      grid[start][start+1] == 1;
      for ( int i = 1; i < start; i++ ) {
        grid[start][i] == grid[start-1][i] + grid[start-1][i+1];
      }
    }
  }
  public String toString () {
    output = "";
    for ( int i = 0; i < end; i++ ) {
      for ( int j = 0; j < end; j++ ) {
        if ( grid[i][j] != 0 ) {
          output += grid[i] + " ";
        }
      }
      output += "\n";
    }
    return output;
  }
}
