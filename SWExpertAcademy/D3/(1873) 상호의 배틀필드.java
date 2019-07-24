import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int sline,sx,sy;
	static char[][] field;
	static char[] move;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for(int t = 1;t <= testcase;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			field = new char[H][W];
			for(int i = 0;i < field.length;i++) {
				String line = br.readLine();
				for(int j = 0;j < field[i].length;j++) {
					field[i][j] = line.charAt(j);
					if(field[i][j] == '<' ||field[i][j] == '>' ||field[i][j] == '^' ||field[i][j] == 'v') {
						sx = i;
						sy = j;
					}
				}		
			}
			sline = Integer.parseInt(br.readLine());
			move = new char[sline];
			String line = br.readLine();
			for(int i = 0;i < move.length;i++)
				move[i] = line.charAt(i);
			solution(sx,sy,0);
			StringBuilder result = new StringBuilder(String.format("#%d ", t));
			for(int i = 0;i < field.length;i++) {
				for(int j = 0;j < field[i].length;j++)
					result.append(field[i][j]);
                if(i < field.length - 1)
					result.append("\n");
			}
			System.out.println(result);
		}
	}
	static void solution(int x,int y,int depth) {
		if(depth == sline) {
			return;
		}
		switch(move[depth]) {
		case 'S':
			Field(x,y);
			break;
		case 'U':
			if(x - 1 < 0 || field[x-1][y] == '-' || field[x-1][y] == '#'||field[x-1][y] == '*') {
				field[x][y] = '^';
				break;
			}
			field[x][y] = '.';
			x--;
			field[x][y] = '^';
			break;
		case 'D':
			if(x + 1 > field.length - 1 || field[x+1][y] == '-'|| field[x+1][y] == '#'||field[x+1][y] == '*') {
				field[x][y] = 'v';
				break;
			}
			field[x][y] = '.';
			x++;
			field[x][y] = 'v';
			break;
		case 'L':
			if(y - 1 < 0 || field[x][y-1] == '-'|| field[x][y-1] == '#'||field[x][y-1] == '*') {
				field[x][y] = '<';
				break;
			}
			field[x][y] = '.';
			y--;
			field[x][y] = '<';
			break;
		case 'R':
			if(y + 1 > field[x].length - 1 || field[x][y+1] == '-'|| field[x][y+1] == '#'||field[x][y+1] == '*') {
				field[x][y] = '>';
				break;
			}
			field[x][y] = '.';
			y++;
			field[x][y] = '>';
			break;
		}
		solution(x,y,depth+1);
	}
	static void Field(int x,int y) {
		char s = field[x][y];
		switch(s) {
		case '^':
			while(x >= 0) {
				if(field[x][y] == '*') {
					field[x][y] = '.';
					break;
				}
				else if(field[x][y] == '#')
					break;
				x--;
			}
			break;
		case 'v':
			while(x < field.length) {
				if(field[x][y] == '*') {
					field[x][y] = '.';
					break;
				}
				else if(field[x][y] == '#')
					break;
				x++;
			}
			break;
		case '<':
			while(y >= 0) {
				if(field[x][y] == '*') {
					field[x][y] = '.';
					break;
				}
				else if(field[x][y] == '#')
					break;
				y--;
			}
			break;
		case '>':
			while(y < field[x].length) {
				if(field[x][y] == '*') {
					field[x][y] = '.';
					break;
				}
				else if(field[x][y] == '#')
					break;
				y++;
			}
			break;
		}
	}
}
