package com.suchtool.nicetool.util.web.http.curl.bo;

import com.suchtool.nicetool.util.web.http.curl.vo.CurlVO;
import lombok.Data;
import org.springframework.http.HttpMethod;

import javax.validation.constraints.NotBlank;
import java.time.Duration;

@Data
public class CurlBO {
    @NotBlank(message = "url不能为空")
    private String url;

    private HttpMethod httpMethod = HttpMethod.GET;

    /**
     * 是否启用重定向
     */
    private Boolean enableFollowRedirect = true;

    /**
     * 是否获取响应头。若获取，则如下两个字段会有相应数据<p>
     * {@link CurlVO#getOriginResponse()}<p>
     * {@link CurlVO#getResponseHeader()} （此字段只有第一个请求的响应Header）
     */
    private Boolean enableResponseHeader = false;

    /**
     * 是否获取响应体
     */
    private Boolean enableResponseBody = false;

    private Integer redirectMaxCount = 5;

    private Duration timeout = Duration.ofSeconds(5);

    private String proxyUsername;

    private String proxyPassword;

    private String proxyHost;

    private Integer proxyPort;
}
