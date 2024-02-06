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

todo
P50