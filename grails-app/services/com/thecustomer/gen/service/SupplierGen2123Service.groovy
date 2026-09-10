// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen2123Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 588 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 9013 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 7931 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 2474 }
    /** Derived accessor for code (generated filler). */
    def computeCode4() { return 4019 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 7576 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage6() { return 4357 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 3907 }
    /** Derived accessor for active (generated filler). */
    def computeActive8() { return 874 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 2304 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 6804 }
    /** Derived accessor for unitPrice (generated filler). */
}
