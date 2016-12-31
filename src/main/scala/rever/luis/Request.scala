package rever.luis

/**
 * Created by zkidkid on 12/31/16.
 */
class LuisRequest(appId:String,contentType:String,subscriptionKey:String,requestBody:String)

class AddLabelRequest(label:String,appId:String,contentType:String,subscriptionKey:String,requestBody:String)
  extends LuisRequest(_,_,_,_)

