package com.example.solution;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board){



  for(int row=0;row<9;row++) {
      Set<Character> rows = new HashSet<>();
      for (int i = 0; i < 9; i++) {
          if (board[row][i] == '.') continue;
          if (rows.contains(board[row][i])) return false;
          rows.add(board[row][i]);

      }
  }

      for(int col=0;col<9;col++){
          Set<Character> cols = new HashSet<>();
          for(int i=0;i<9;i++){
              if(board[i][col] =='.') continue;
              if(cols.contains(board[i][col])) return false;
              cols.add(board[i][col]);

          }

  }

      for(int square=0;square<9;square++){
          Set<Character> squares = new HashSet<>();
          for(int i=0;i<3;i++) {

              for (int j = 0; j < 3; j++) {

              int r=(square/3)*3+i;
              int c=(square%3)*3+j;


                  if (board[r][c] == '.') continue;
                  if (squares.contains(board[r][c])) return false;
                  squares.add(board[r][c]);

              }
          }

      }

      return false;
    }
}
