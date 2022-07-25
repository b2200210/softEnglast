package com.example.linebot.replier;

import com.linecorp.bot.model.message.Message;
import com.linecorp.bot.model.message.TextMessage;

public class Temp implements Replier{
    @Override
    public Message reply(){
        return new TextMessage("明日の予測最高気温は32.0℃です");
    }

}
