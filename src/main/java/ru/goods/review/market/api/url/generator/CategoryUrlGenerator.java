package ru.goods.review.market.api.url.generator;

import ru.goods.review.market.api.provider.APISettings;
import ru.goods.review.market.api.provider.Resource;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 15:04
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public abstract class CategoryUrlGenerator {

    private CategoryUrlGenerator(){}

    public static String urlForListOfCategories(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.CATEGORY.getName()).append("/").
                append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlForInfoAboutCategory(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.CATEGORY.getName()).append("/").
                append(id).append("/").
                append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlForListOfChildrenCategoriesById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.CATEGORY.getName()).append("/").
                append(id).append("/").append(Resource.CHILDREN.getName()).
                append("/").append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlFolListOfModelsOfCategoryById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.CATEGORY.getName()).append("/").
                append(id).append("/").append(Resource.MODELS.getName()).
                append("/").append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

    public static String urlFolListOfFiltersOfCategoryById(long id){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL).append("/").
                append(Resource.CATEGORY.getName()).append("/").
                append(id).append("/").append(Resource.FILTERS.getName()).
                append("/").append(APISettings.RESPONSE_FORMAT).
                append("?").append(APISettings.GEO_ID_PARAM);
        return stringBuilder.toString();
    }

}
