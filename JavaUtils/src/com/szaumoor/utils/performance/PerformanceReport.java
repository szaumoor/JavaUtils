package com.szaumoor.utils.performance;

import java.math.BigDecimal;

public record PerformanceReport(BigDecimal total, BigDecimal average, BigDecimal max, BigDecimal min)  {
}
