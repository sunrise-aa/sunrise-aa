# Android

#### 介绍
仿美团app的安卓移动app开发
#### 软件架构
###### 本项目采用安卓开发工具，包含登录购买付款功能
######  目录
###### 仿美团外卖APP制作


1. 需求分析	
1.1项目概述		
1.2用例分析	
1.3开发环境	
1.4 总体功能设计	
2.  详细设计	
2.1 服务器设计
2.2 客户端设计	
3.  店铺功能业务设计	
3.1 菜品功能业务设计	
3.2 订单功能业务设计	
4. 运行结果	
4.1店铺列表界面	
4.2店铺详情界面	
4.3购物车界面	
4.4菜品详情界面	
4.5订单界面	
5. 总结	

#### 仿美团外卖APP制作
#### 1. 需求分析
- 1.1项目概述
- 仿美团外卖项目是一个网上订餐项目，该项目中包含订餐的店铺、各店铺的菜单、购物车以及订单与付款等模块。在店铺列表中可以看到店铺的名称、月售数量、起送价格与配送费用、配送时间以及店铺特色等信息，点击店铺列表中的任意一个店铺，程序会进入到店铺详情界面，该界面主要用于显示店铺中的菜单信息，同时可以将想要吃的菜添加到购物车中，选完菜之后可以点击该界面中的“去结算”按钮，进入到订单界面，在该界面核对已点的菜单信息，并通过“去支付”按钮进行付款。
- 1.2用例分析
- 用例图是被参与者的外部用户所能观察到的系统功能的模型图，呈现了一些参与者和一些用例，以及它们之间的关系。

- 系统主要功能用例如图1-2所示。

![输入图片说明](https://foruda.gitee.com/images/1665192895575956872/7063dd44_10148298.png "屏幕截图")

- 图1-2 主要功能用例图

1. 开发环境

操作系统：
Windows系统 10

开发工具：
JDK 8
Android Studio 3.2 +模拟器（夜神模拟器）
Tomcat 9.0.44

API版本：
Android API 29

#### 2. 总体功能设计

基于Android的仿美团外面APP，作为网上订餐项目，该项目中包含订餐的店铺、各店铺的菜单、购物车以及订单与付款等功能。功能包括如下几个部分：

（1）店铺首页包含广告和商品部分信息的简单介绍

（2）店铺详情界面不仅显示店铺的详细信息，还显示各店铺中的菜单列表信息与购物车列表信息

（3）订单模块包含确认订单界面与支付界面，确认订单界面用于显示购物车中已添加的商品信息

- 该系统总功能结构如图1-1所示：

![输入图片说明](https://foruda.gitee.com/images/1665192935282854788/ecc7b6a2_10148298.png "屏幕截图")

- 图1-1 总功能结构图

#### 3. 详细设计

3.1 服务器设计

仿美团外卖的项目涉及的数据存放在一个小型简易的服务器（这里以apache-tomcat-9.0.44）中，服务器中存放数据的目录结构如图3-1所示。

![输入图片说明](https://foruda.gitee.com/images/1665192954231444828/ab3a42f1_10148298.png "屏幕截图")


```c
[
{
"id":1,
"shopName":"蛋糕房",
"saleNum":996,
"offerPrice":100,
"distributionCost":5,
"feature":"进店可获得一个香草冰淇淋",
"time":"配送约2-5小时",
"banner":"http://192.168.100.118:8080/order/img/banner/1.png",
"shopPic":"http://192.168.100.118:8080/order/img/shop/shop1.png",
"shopNotice":"公告：下单后2-5小时送达！请耐心等候",
"foodList":[
	{ 
	"foodId":"1",
	"foodName":"招牌丰收硕果12寸",
	"popularity":"门店销量第1名",
	"taste":"水果、奶油、面包、鸡蛋",
	"saleNum":"50",
	"price":198,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food1.png"
	},
	{
	"foodId":"2",
	"foodName":"玫瑰花创意蛋糕",
	"popularity":"门店销量第2名",
	"taste":"玫瑰花、奶油、鸡蛋",
	"saleNum":"100",
	"price":148,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food2.png"
	},
	{
	"foodId":"3",
	"foodName":"布朗熊与可妮",
	"popularity":"门店销量第3名",
	"taste":"奶油、巧克力、果粒夹层",
	"saleNum":"80",
	"price":90,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food3.png"
	}
	]
},
{
"id":2,
"shopName":"爪哇咖啡.西餐.酒吧",
"saleNum":11,
"offerPrice":20,
"distributionCost":7,
"feature":"进店即可送一杯拿铁咖啡",
"time":"配送约40分钟",
"banner":"http://192.168.100.118:8080/order/img/banner/2.png",
"shopPic":"http://192.168.100.118:8080/order/img/shop/shop2.png",
"shopNotice":"公告：本店周一到周五所有套餐打八折，送咖啡。",
"foodList":[
	{ 
	"foodId":"1",
	"foodName":"双人牛排套餐",
	"popularity":"门店销量第1名",
	"taste":"招牌牛仔骨配煎蛋及意大利面",
	"saleNum":"50",
	"price":575,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food21.png"
	},
	{
	"foodId":"2",
	"foodName":"单人饮品套餐",
	"popularity":"门店销量第2名",
	"taste":"摩卡、提拉米苏蛋糕",
	"saleNum":"79",
	"price":49,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food22.png"
	},
	{
	"foodId":"3",
	"foodName":"浪漫情侣套餐",
	"popularity":"门店销量第3名",
	"taste":"铁板牛仔骨牛排、铁板菲力牛排、烟熏三文鱼佐土豆泥",
	"saleNum":"47",
	"price":368,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food23.png"
	}
	]
},
{
"id":3,
"shopName":"必胜客",
"saleNum":10,
"offerPrice":15,
"distributionCost":5,
"feature":"下单即可获得一个￥5优惠券",
"time":"配送约20分钟",
"banner":"http://192.168.100.118:8080/order/img/banner/3.png",
"shopPic":"http://192.168.100.118:8080/order/img/shop/shop3.png",
"shopNotice":"公告：狂欢尽兴 必胜有礼 5折开抢。",
"foodList":[
	{ 
	"foodId":"1",
	"foodName":"3份单人工作日特惠餐",
	"popularity":"门店销量第1名",
	"taste":"披萨、沙拉、柠檬红茶",
	"saleNum":"50",
	"price":99,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food31.png"
	},
	{
	"foodId":"2",
	"foodName":"拼盘+嗨杯鲜果茶",
	"popularity":"门店销量第2名",
	"taste":"薯条、鸡翅、鸡米花",
	"saleNum":"140",
	"price":49,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food32.png"
	},
	{
	"foodId":"3",
	"foodName":"德克萨斯牛排2份",
	"popularity":"门店销量第3名",
	"taste":"牛肉、柠檬茶",
	"saleNum":"141",
	"price":57,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food33.png"
	}
	]
},
{
"id":4,
"shopName":"艾尚夜宵",
"saleNum":496,
"offerPrice":20,
"distributionCost":13,
"feature":"下单即可获得一个￥15优惠券",
"time":"配送约42分钟",
"banner":"http://192.168.100.118:8080/order/img/banner/4.png",
"shopPic":"http://192.168.100.118:8080/order/img/shop/shop4.png",
"shopNotice":"公告：本店赠送爱心早餐。",
"foodList":[
	{ 
	"foodId":"1",
	"foodName":"烤牛肉炒饭",
	"popularity":"门店销量第1名",
	"taste":"原味、牛肉、玉米、豌豆、胡萝卜",
	"saleNum":"102",
	"price":18.8,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food41.png"
	},
	{
	"foodId":"2",
	"foodName":"嫩豆腐汤+米饭",
	"popularity":"门店销量第2名",
	"taste":"香辣、豆腐花、鸡蛋",
	"saleNum":"66",
	"price":14.5,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food42.png"
	},
	{
	"foodId":"3",
	"foodName":"超辣-酸辣土豆丝",
	"popularity":"门店销量第3名",
	"taste":"酸辣、土豆、青尖椒",
	"saleNum":"59",
	"price":14,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food43.png"
	}
	]
},
{
"id":5,
"shopName":"上岛咖啡",
"saleNum":300,
"offerPrice":30,
"distributionCost":10,
"feature":"下单即可获得一个￥30优惠券",
"time":"配送约30分钟",
"banner":"http://192.168.100.118:8080/order/img/banner/5.png",
"shopPic":"http://192.168.100.118:8080/order/img/shop/shop5.png",
"shopNotice":"公告：本店牛排买一送一。",
"foodList":[
	{ 
	"foodId":"1",
	"foodName":"特惠双人餐",
	"popularity":"门店销量第1名",
	"taste":"牛排、沙拉、浓汤",
	"saleNum":"102",
	"price":109,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food51.png"
	},
	{
	"foodId":"2",
	"foodName":"超值双人餐",
	"popularity":"门店销量第2名",
	"taste":"牛排、法包、蔬菜沙拉",
	"saleNum":"100",
	"price":139,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food52.png"
	},
	{
	"foodId":"3",
	"foodName":"双人饮品",
	"popularity":"门店销量第3名",
	"taste":"茉莉白龙王、卡布奇诺",
	"saleNum":"70",
	"price":69,
	"count":0,
	"foodPic":"http://192.168.100.118:8080/order/img/food/food53.png"
	}
	]
}
]

```


- 图3-1 存放数据的目录结构

3.2 客户端设计

3.2.1 店铺功能业务设计

搭建标题栏布局

![输入图片说明](https://foruda.gitee.com/images/1665192970112181338/e742ea59_10148298.png "屏幕截图")

搭建广告栏界面布局

![输入图片说明](https://foruda.gitee.com/images/1665192982085419715/cde1e333_10148298.png "屏幕截图")

搭建店铺界面布局

![输入图片说明](https://foruda.gitee.com/images/1665192998132720696/f4d4d345_10148298.png "屏幕截图")





搭建店铺列表条目界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193011429516382/736424fa_10148298.png "屏幕截图")

搭建店铺详情界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193027842392846/67c3cf2f_10148298.png "屏幕截图")

![输入图片说明](https://foruda.gitee.com/images/1665193045150441908/fa87b7c9_10148298.png "屏幕截图")

创建ShopBean类和FoodBean类与封装店铺和菜单信息的属性。

编写广告栏的适配器，创建一个数据适配器AdBannerAdapter将获取到的数据传递到创建的AdBannerFragment中。

编写店铺列表适配器，创建一个数据适配器ShopAdapter对ShopListView控件进行数据适配。实现店铺界面显示功能，添加okhttp库，添加gson库，创建Constant类，创建JsonParse类。

当店铺列表界面的条目被点击后，程序会跳转到店铺详情界面，该界面主要分为三个部分，其中第一部分用于展示店铺的信息，第二部分用于展示该店铺中的菜单列表，第三部分用于展示购物车。

实现步骤为搭建店铺详情界面布局、菜单列表条目界面布局、购物车列表条目界面布局、确认清空购物车界面布局。编写菜单列表适配器，创建菜单列表适配器MenuAdapter，创建ViewHolder类，创建OnSelectListener接口。

编写购物车列表适配器，创建购物车列表适配器CarAdapter，创建ViewHolder类，创建OnSelectListener接口。

实现菜单显示与购物车功能，获取界面控件，实现添加与删除购物车中的菜品，设置界面数据。

3.2.2 菜品功能业务设计

搭建菜单列表条目界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193059318835614/b1f29f51_10148298.png "屏幕截图")

搭建购物车列表条目界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193069545011536/9893f735_10148298.png "屏幕截图")

搭建确认清空购物车界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193079845109576/308a9f14_10148298.png "屏幕截图")

搭建菜品详情界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193112124679168/7ba2bc87_10148298.png "屏幕截图")

点击菜单列表的条目，程序会跳转到菜品详情界面，该界面主要用于展示菜品的名称、月售数量和价格等信息。菜品详情界面中的数据是从店铺详情界面传递过来的。

实现步骤为搭建菜品详情界面布局：创建FoodActivity，指定布局文件名为activity_food，放置3个TextView控件、1个lmageView控件，在styles.xml文件中创建对话框样式Theme.ActivityDialogStyle,在清单文件中的FoodActivity对应的<activity />标签,在该标签中引入对话框样式。

实现菜品界面显示功能，获取界面控件：在FoodActivity中创建初始化界面控件的方法initView()；设置界面数据：在FoodActivity中创建一个setData()方法，该方法用于将数据设置到菜品详情界面的控件上；修改MenuAdapter.java文件：在MenuAdapter中的getView()方法中的注释“//跳转到菜品详情界面”下方添加跳转到菜品详情界面的逻辑代码。

3.2.3 订单功能业务设计

搭建订单界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193127182205559/789fa1ef_10148298.png "屏幕截图")

搭建订单列表条目界面布局

![输入图片说明](https://foruda.gitee.com/images/1665193138490867983/4516e1c7_10148298.png "屏幕截图")

在店铺详情界面，点击“去结算”按钮，程序会跳转到订单界面，订单界面主要展示的是收货地址、订单列表、小计、配送费以及订单总价与“去支付”按钮，该界面的数据是从店铺详情界面传递过来的。

点击“去支付”按钮，程序会弹出一个二维码支付界面供用户付款。实现步骤为搭建订单界面布局、订单列表条目界面布局、支付界面布局。

编写订单列表适配器，创建订单列表适配器OrderAdapter：在该适配器中重写getCount()方法、getItem()方法、getItemId()方法和getView()方法。创建ViewHolder类。

实现订单显示与支付功能，获取界面控件：在OrderActivity中创建界面控件的初始化方法init()，该方法用于获取订单界面所要用到的控件并实现返回键与“去支付”按钮的点击事件。

设置界面数据：在OrderActivity中创建一个setData()方法，该方法用于将数据设置到订单界面的控件上。修改ShopDetailActivity.java文件： 由于点击店铺详情界面的“去结算”按钮时，会跳转到订单界面，所以需要找到ShopDetailActivity中的onClick()方法，在该方法中的注释“//跳转到订单界面”下方添加跳转到订单界面的逻辑代码。

#### 4. 运行结果

4.1店铺列表界面

软件打开后，首先会进入店铺列表界面，该界面展示的是一个水平滑动的广告栏和一些由店铺信息组成的列表，界面如图4-1所示。

      ![输入图片说明](https://foruda.gitee.com/images/1665193162712399465/20f48afe_10148298.png "屏幕截图")

![输入图片说明](https://foruda.gitee.com/images/1665193215913701533/80076a5f_10148298.png "屏幕截图")

图4-1 店铺列表界面

4.2店铺详情界面

点击店铺列表中任意一个条目或广告栏中的任意一张图片，程序都会挑跳转到对应的店铺详情界面，该界面展示的是店铺的公告信息、配送信息、菜单列表信息及购物车列表信息，界面如图4.2-1所示。

![输入图片说明](https://foruda.gitee.com/images/1665193243634552802/2fcf1c1e_10148298.png "屏幕截图")

图4.2-1 店铺详情界面 (1)

4.3购物车界面

点击菜单列表条目右侧的“加入购物车”按钮可以将菜品添加到购物车中，在界面左下角可以看到购物车中添加的菜品数量，如图4.3-1所示。
      
图4.3-1店铺详情界面 (1)

在图4.3-1所示的已选商品列表的右上角有一个“清空”按钮，点击该按钮会弹出一个确认清空购物车的界面，界面为对话框样式，如图4.3-2所示。

图4.3-2 确认清空购物车的界面

4.4菜品详情界面

在店铺详情界面中，点击菜单列表的任意一个条目，程序都会跳转到菜品详情界面。菜品详情界面是一个对话框的样式，界面如图4-4所示。

图4-4 菜品详情界面

4.5订单界面

点店铺详情界面中，点击“去结算”按钮会跳转到订单界面，该界面通过一个列表展示购物车中的菜品信息，点击“去支付”按钮，程序会弹出一个显示支付二维码的对话框，界面如图2-4所示。
    
图2-4 订单界面和支付界面

5. 总结
本次课程实训所设计的是一个安卓移动仿美团网上订餐项目，该项目中包含店铺列表、店铺详情、菜品详情、订单等界面。在本项目的实现过程中用到了异步线程访问网络、Tomcat服务器、Handler消息机制、JSON数据解析等技术。主要从系统的需求分析、总体功能设计、详细设计到最后的运行结果这几个方面阐述整个系统的实现。

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
