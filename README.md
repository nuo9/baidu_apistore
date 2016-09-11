#baidu_apistore

java implements of http://apistore.baidu.com/

初始化：
ApiStoreSDK.init(String apikey);

要实现某个具体应用，
可以写一个类extends AbstractApp或者implements IApp，
（已经实现了几个），
然后根据接口的具体规定覆盖部分方法，
使用ApiStoreSDK.call调用
