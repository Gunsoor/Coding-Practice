package kakao.codingtest;

public class MatchBracket {
	public static String solution(String p) {

		if (p.length() == 0)
			return p;

		int leftCnt = 0;
		int rightCnt = 0;

		String u = "";
		String v = "";

		for (int i = 0; i < p.length(); ++i) {

			u += p.charAt(i);

			if (p.charAt(i) == '(') {
				++leftCnt;
			} else {
				++rightCnt;
			}

			if (leftCnt == rightCnt) {
				v = p.substring(i + 1, p.length());
				break;
			}

		}

		if (!u.isEmpty()) {
			if (u.charAt(0) == '(') {
				u += solution(v);
				return u;
			} else {
				String str = "(" + solution(v) + ")";
				String tmpU = "";
				String result = "";
				for (int i = 1; i < u.length() - 1; ++i) {
					tmpU += u.charAt(i);
				}
				for (int i = 0; i < tmpU.length(); ++i) {
					if (tmpU.charAt(i) == '(')
						result += ")";
					else
						result += "(";
				}
				return str + result;
			}
		}

		return "";
	}
	
	public static void main(String[] args) {
		System.out.println(solution(")()("));
	}
}
