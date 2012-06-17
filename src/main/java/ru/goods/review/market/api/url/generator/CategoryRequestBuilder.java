package ru.goods.review.market.api.url.generator;

import ru.goods.review.market.api.provider.APISettings;
import ru.goods.review.market.api.provider.Resource;

import java.util.Map;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 15:04
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public class CategoryRequestBuilder extends RequestBuilder {

    public CategoryRequestBuilder() {
        super();
    }

    public String urlForListOfCategories(Map<String, String> parameters) {
        return build(new String[]{Resource.CATEGORY.getName()},
                parameters);
    }

    public String urlForInfoAboutCategoryById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.CATEGORY.getName(), String.valueOf(id)},
                parameters);
    }

    public String urlForListOfChildrenCategoriesById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.CATEGORY.getName(), String.valueOf(id), Resource.CHILDREN.getName()},
                parameters);
    }

    public String urlFolListOfModelsOfCategoryById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.CATEGORY.getName(), String.valueOf(id), Resource.MODELS.getName()},
                parameters);
    }

    public String urlFolListOfFiltersOfCategoryById(long id, Map<String, String> parameters) {
        return build(new String[]{Resource.CATEGORY.getName(), String.valueOf(id), Resource.FILTERS.getName()},
                parameters);
    }

}
