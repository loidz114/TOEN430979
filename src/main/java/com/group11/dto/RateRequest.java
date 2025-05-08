package com.group11.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RateRequest {
    private Long productId;         // ID sản phẩm
    private Long userId;            // ID người dùngg
    private String content;         // Nội dung đánh giá
    private int rate;
}
