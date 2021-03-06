package day02;

public class Prob2 {
	public static void main(String[] args) {
		/*
		  변수 num의 값에따라 양수 음수 0을 출력하는 코드를 완성하세요. 힌트: 삼항연산자.
		 */
		int num = 0;
		System.out.println("양수 음수  0 판별후 출력");
		System.out.printf("%d => ",num );
		System.out.println(num > 0 ? "양수" :(num == 0 ? "0": "음수"));

		/*
		 * 다음은 대문자를 소문자로 변경하는 코드입니다. 변수 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성 합니다.
		 * 
		 * char ch = 'P'; char lowerCase = ________삼항 연산 자로 처리________;
		 * System.out.print("ch:"+ch); System.out.println(" to lowerCase :"+lowerCase);
		 * 
		 */
		
		char ch = '9';
		//char lowerCase = ch >= 'a' && ch <= 'z'?ch:(char)(ch+32);
		char lowerCase = (ch >= 'A' && ch <='Z') ? (char)(ch+32): ch;

		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);

		
		
		/* 년도를 입력받아 윤년인지 판별하여 출력해 보세요 */

		int year = 2100;
		System.out.print(year+"==>");
		System.out.println((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))?"윤년":"평년");
	}
}
/*
 * 1804 ,1808 ,1812 ,1816 ,1820 ,1824 ,1828 ,1832 ,1836 ,1840 ,1844 , 1848 ,1852
 * ,1856 ,1860 ,1864 ,1868 ,1872 ,1876 ,1880 ,1884 ,1888 , 1892 ,1896 ,1904
 * ,1908 ,1912 ,1916 ,1920 ,1924 ,1928 ,1932 ,1936 , 1940 ,1944 ,1948 ,1952
 * ,1956 ,1960 ,1964 ,1968 ,1972 ,1976 ,1980 , 1984 ,1988 ,1992 ,1996 ,2000
 * ,2004 ,2008 ,2012 ,2016 ,2020 ,2024 , 2028 ,2032 ,2036 ,2040 ,2044 ,2048
 * ,2052 ,2056 ,2060 ,2064 ,2068 , 2072 ,2076 ,2080 ,2084 ,2088 ,2092 ,2096
 * ,2104 ,2108 ,2112 ,2116 , 2120 ,2124 ,2128 ,2132 ,2136 ,2140 ,2144 ,2148
 * ,2152 ,2156 ,2160 , 2164 ,2168 ,2172 ,2176 ,2180 ,2184 ,2188 ,2192 ,2196
 * ,2204 ,2208 , 2212 ,2216 ,2220 ,2224 ,2228 ,2232 ,2236 ,2240 ,2244 ,2248
 * ,2252 , 2256 ,2260 ,2264 ,2268 ,2272 ,2276 ,2280 ,2284 ,2288 ,2292 ,2296 ,
 */