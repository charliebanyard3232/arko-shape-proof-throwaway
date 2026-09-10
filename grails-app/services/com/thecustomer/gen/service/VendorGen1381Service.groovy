// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen1381Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 6426 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 907 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 3917 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 5178 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 9720 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 2546 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 7061 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 2202 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 4183 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 634 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 8952 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 6795 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 9198 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 3672 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence14() { return 22 }
}
