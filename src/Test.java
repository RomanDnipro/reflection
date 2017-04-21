
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException /*throws IllegalAccessException, InstantiationException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException*/ {

        Constructor<Holder> constructor = Holder.class.getDeclaredConstructor();

//        Holder holder = constructor.newInstance();
//        constructor.setAccessible(true);
//
//        Class<Holder> holderClass = Holder.class;
//        Method[] declaredMethods = holderClass.getDeclaredMethods();
//        for (Method m:declaredMethods) {
//            System.out.println(m.getName());
        }







//        Class<Holder> clss = Holder.class;
//
//        Constructor<Holder> constructor= (Constructor<Holder>) Holder.class.getDeclaredConstructors()[0];
//        constructor.setAccessible(true);
//        Holder obj = constructor.newInstance("foo");
////        System.out.println(obj);
//
//        Method method = obj.getClass().getEnclosingMethod();
//        method.setAccessible(true);
//        Object r = method.invoke(obj);
    }
}
