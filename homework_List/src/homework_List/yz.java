package homework_List;

import java.util.*;
import java.io.*;
public class yz {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		List<worker> list = new ArrayList<worker>();
		list.add(new worker(1500.00, "s1001", "����", "˾��"));
		list.add(new worker(3000.00, "s2001", "����", "������"));
		list.add(new worker(7500.00, "s4501", "����", "��ʿ"));
		
		worker w = new worker(9500.00, "s4502", "л���", "����ҽʦ");
		list.add(w);
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		String str;
		while(true)
		{
			str = input.readLine();
			if(str.equals("query"))
			{
				str = input.readLine();
				for(worker ww : list)
				{
					if(str.equals(ww.id))
					{
						System.out.println(ww.id + " " + ww.name + " " + ww.sal + " " + ww.job);
					}
				}
			}else
			if(str.equals("update"))
			{
				str = input.readLine();
				for(worker ww : list)
				{
					if(str.equals(ww.id))
					{
						str = input.readLine();
						if(str.equals("id"))
						{
							str = input.readLine();
							ww.id = str;
						}else
						if(str.equals("name"))
						{
							str = input.readLine();
							ww.name = str;
						}else
						if(str.equals("job"))
						{
							str = input.readLine();
							ww.job = str;
						}else
						if(str.equals("sal"))
						{
							double sal = scan.nextDouble();
							ww.sal = sal;
						}
					}
				}
			}else
			{
				str = input.readLine();
				for(worker ww : list)
				{
					if(str.equals(ww.id))
					{
						list.remove(ww);
						break;
					}
				}
			}
		}
	}
}
