public class GC 
{
  static class DemoObject 
  {
        private String name;
        DemoObject(String name)
    {
            this.name = name;
        }
        protected void finalize() throws Throwable
    {
            System.out.println("Garbage collected: " + name);
        }
    }

    public static void main(String[] args)
  {
        DemoObject obj1 = new DemoObject("Object1");
        DemoObject obj2 = new DemoObject("Object2");
        obj1 = null;
        obj2 = null;
        System.gc();
        try {
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e)
          {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
