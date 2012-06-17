package ru.goods.review.market.api.url.generator;

import ru.goods.review.market.api.provider.APISettings;

import java.util.Map;

/**
 * Artemij Chugreev
 * Date: 17.06.12
 * Time: 16:58
 * email: achugr@yandex-team.ru
 * skype: achugr
 */
public class RequestBuilder {

    public String build(String[] resources, Map<String, String> parameters) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(APISettings.MAIN_API_URL);
        for (String resource : resources) {
            stringBuilder.append("/").append(resource);
        }
        stringBuilder.append(APISettings.RESPONSE_FORMAT);
        stringBuilder.append("?");

        appendDefaultParameters(stringBuilder);

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue());
            stringBuilder.append("&");
        }
        return stringBuilder.toString();
    }

    private static void appendDefaultParameters(StringBuilder stringBuilder) {
        for (Map.Entry<String, String> entry : APISettings.DEFAULT_PARAMETERS.entrySet()) {
            stringBuilder.append(entry.getKey()).append("=").append(entry.getValue());
            stringBuilder.append("&");
        }
    }
}
