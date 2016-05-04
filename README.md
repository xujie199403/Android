Android
===================================  
开发环境：Android Studio 2.0



### BMR
  First App.
  
### Toast 
  浮动提示窗体
  
###Chat 
**EventListener**:

| Name                   |Interface                      |     
|:----------------------:|:-----------------------------:|
|   onClick()            | OnClickListener               |
|  onLongClick()         | OnLongClickListener           |      
|  onFocusChange()       | OnFocusChangeListener         |      
|    onKey()             | OnKeyListener                 |
| onCreateContextMenu()  | OnCreateContextMenuListener   |  
  
###map
  通过Intent调用手机的基础功能
  
  >Web：
  ```java
    Uri uri=Uri.parse("http://www.google.com.tw"); 
    Intent i=new Intent(Intent.ACTION_VIEW,uri); 
    startActivity(i);
  ```
  >telphone：
  ```java
    Uri uri=Uri.parse("tel:12345678"); 
    Intent i=new Intent(Intent.ACTION_VIEW,uri); 
    startActivity(i); 
  ```
  >Camera:
  ```java
    Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    startActivity(i);
  ```
  >email：
  ```java
    Uri uri=Uri.parse("123456@123.com"); 
    Intent i=new Intent(Intent.ACTION_SENDTO,uri);
    startActivity(i); 
  ```

###Run
  Intent方法：通过按钮实现页面跳转。
  
###Test

>Bundle_Sender
  1. create an intent pass class name or intnet action name   
  2. put key/value data
  3. or you can add data to a bundle
  4. add bundle to intent
  5. start the activity
  
>Bundle_Receive
  1. get passed intent
  2. get message value from intent
  3. show message on textView
  4. get bundle from intent
  5. get status value from bundle
  6. show status on Toast

###Json

JSON 全名为 JavaScript Object Notation</br>
JSON 是一种轻量级的资料交换语言，以文字为基础

{“name”: “alpha”}
```java
String json = “{“+ “\”name\” : \”alpha\”+ “}”
// 字串一開始是{}也就是物件，因此宣告一個JSON物件；
JSONObject jsonObj = new JSONObject(json);
//宣告字串 nameVale 來存放剛剛撈到 name的 value “alpha”
String nameVale = jsonObj.getString(“name”);
String nameVale = new JSONObject(json).getString(“name”);
```
[1,”alpha”, {“id”:3} ]
```java
String json = “[“+ “1,”+ “\”alpha\”,”+ “{“+ “\”id\”:3”+ “}”+ “]”
//字串一開始是[]字串陣列則宣告JSON陣列。
JSONArray jsonArray = new JSONArray(json);
int data0 = jsonArray.getInt(0);
String data1 = jsonArray.geString(1);
JSONObject data2 =  jsonArray.getJSONObject(2);
```




  
  
  
