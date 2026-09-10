// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ProductGen4452Service {

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
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 4727 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 4670 }
    /** Derived accessor for status (generated filler). */
    def computeStatus2() { return 3543 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 2609 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 7865 }
    /** Derived accessor for priority (generated filler). */
    def computePriority5() { return 1455 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 2219 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 3482 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 5818 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 2096 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 2150 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 8343 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 509 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 6746 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 194 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 6618 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice16() { return 4076 }
    /** Derived accessor for reference (generated filler). */
    def computeReference17() { return 2864 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn18() { return 4714 }
    /** Derived accessor for percentage (generated filler). */
}
