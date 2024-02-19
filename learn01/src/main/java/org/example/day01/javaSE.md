1/ jdk：java开发者工具
    jre：Java运行环境
    jvm：Java虚拟机
2/ 八进制  0
    十六进制  0x
3/类型转换
    Java是强类型语言，
    强制转换  （类型）变量名   高->低
    自动转换   低->高
4/ Scanner对象
    next（）不能得到带有空格的字符串
    nextLine（）返回的是输入回撤之前的字符串
5/ switch
    switch(expression)
    case value:
    //语句
    break；
    case value：
    //语句
    break；
    default：
    //语句
    case穿透现象，没有break，就一直往下走
6/ 增强for循环
    for(int x:numbers)
7/重载
    类型相同
    入参不同
    返回值可同可不同（重载与返回类型无关）
8/可变参数
    在方法声明中，在只指定参数类型后加一个省略号
    public void test(int ...i)
9/数组
    静态初始化  int[] a = {1,2,3};
    动态初始化  int[] b = new int[0]; b[0]=2;b[1]=3;
    数组变量属于引用类型，数组本身就是对象,java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，数组对象本身是在堆中的。

10    Arrays类   包含很多静态方法，可直接调用，
    Arrays.asString();
    Arrays.sort(a)
    Arrays.fill
11 多线程
    继承Thread类
        子类继承Thread类具备多线程能力
        启动线程：子类对象.start()
        不建议使用：避免OOP单继承局限性
    实现Runnable接口
        实现接口RUnnable具有多线程能力
        启动线程：传入目标对象+Thread对象.start()
        推荐使用：避免单继承局限性，灵活方便，方便同一个对象被多个线程使用
12 Lambda表达式
    理解Functional Interface（函数式接口）
13 反射
 class常用方法
    static classforName(String name);//返回指定类名name的Class对象
    Object newInstance();//调用缺省构造函数，返回Class对象的一个实力
    getName（）;//返回Class对象所表示的实体（类，借口，数组类或void）的名称
    Class getSuperClass();/返回当前class对象的父类的Class对象
    Class[] getinterfaces();//获取当前Class对象的借口
    ClassLoader getClassLoader();..返回该类的类加载器
    Constructor[] getConstructors();//返回一个包含某些Constructor对象的数组
    Method getMethod(String name,Class.. T);//返回一个Method对象，此对象的形参类型为paramType
    Filed[] getDeclaredFields();//返回field对象的一个数组
todo
P50