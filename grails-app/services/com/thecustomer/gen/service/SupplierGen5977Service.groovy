// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen5977Service {

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
    def computeThreshold0() { return 9600 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice1() { return 5772 }
    /** Derived accessor for description (generated filler). */
    def computeDescription2() { return 3171 }
    /** Derived accessor for code (generated filler). */
    def computeCode3() { return 1101 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 6464 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 5597 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 6278 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 5935 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice8() { return 424 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 9276 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 8463 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 1898 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 853 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 9149 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 1459 }
    /** Derived accessor for status (generated filler). */
    def computeStatus15() { return 1310 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 6806 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 1828 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency18() { return 3474 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 6344 }
    /** Derived accessor for category (generated filler). */
    def computeCategory20() { return 6529 }
    /** Derived accessor for label (generated filler). */
    def computeLabel21() { return 1808 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg22() { return 3432 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold23() { return 7424 }
    /** Derived accessor for priority (generated filler). */
    def computePriority24() { return 4608 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage25() { return 644 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity26() { return 2799 }
    /** Derived accessor for active (generated filler). */
    def computeActive27() { return 4458 }
}
