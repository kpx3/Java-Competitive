import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;  
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.FileReader;
public class My_Fast_IO 
{ 
    static class RohanReader 
    { 
        BufferedReader br; 
        StringTokenizer st;
        PrintWriter pw;
  
        public RohanReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in));
            pw = new PrintWriter(new OutputStreamWriter(System.out));
        }
        public RohanReader(boolean b)
        {
            try
            {
                br = new BufferedReader( new FileReader("input.txt")); 
                pw = new PrintWriter("output.txt");
            
            }
            catch(Exception e)
            {

            }

        }
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken();
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        }
        void print(Object...objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    pw.print(' ');
            pw.print(objects[i]);
            }
        }
        void println(Object...objects)
        {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0)
                    pw.print(' ');
            pw.print(objects[i]);
            }
            pw.println();
        }
        void closer()
        {
            try{
            br.close();
            pw.flush();
            pw.close();
            }
            catch(Exception e)
            {
            }
        
        }
    }
    public static void main(String[] args) 
    {
        // RohanReader(true)         for File I/O
        // RohanReader()             for terminal I/O    

        RohanReader sc=new RohanReader(true); 

        //CODE BEGIN

        


        //CODE END

        // sc.flush() if the output needs to be flushed
        sc.closer();
    } 
}