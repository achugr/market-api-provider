package ru.goods.review.market.api.provider;

import ru.goods.review.market.api.url.generator.ModelRequestBuilder;

import java.util.HashMap;

/**
 * Artemij Chugreev
 * Date: 16.06.12
 * Time: 20:45
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public class Main {

    public static void main(String[] args) {
        ModelRequestBuilder modelRequestBuilder = new ModelRequestBuilder();
        for(int i=0; i<20; i++){
            ContentAPIProvider contentAPIProvider = new ContentAPIProvider();
            System.out.println(contentAPIProvider.provide(modelRequestBuilder.urlForModelById(8281343, new HashMap<String, String>())).toString());
        }
    }
}
