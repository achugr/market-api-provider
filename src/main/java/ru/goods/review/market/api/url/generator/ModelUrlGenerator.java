package ru.goods.review.market.api.url.generator;

import ru.goods.review.market.api.provider.APISettings;
import ru.goods.review.market.api.provider.Resource;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 1:16
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public abstract class ModelUrlGenerator {

    private ModelUrlGenerator(){}

    public static String urlForModelById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.MODEL.getName()).append("/").append(id).
                append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlForDetailsOnModelById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.MODEL.getName()).append("/").
                append(id).append("/").
                append(Resource.DETAILS.getName()).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlForOffersOnModelById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.MODEL.getName()).append("/").
                append(id).append("/").
                append(Resource.OFFERS.getName()).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlForOutletsOnModelById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.MODEL.getName()).append("/").
                append(id).append("/").
                append(Resource.OUTLETS.getName()).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

}
