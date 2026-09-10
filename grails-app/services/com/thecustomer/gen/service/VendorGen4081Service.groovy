// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VendorGen4081Service {

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
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 4645 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 59 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 5044 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 1802 }
    /** Derived accessor for description (generated filler). */
    def computeDescription4() { return 4571 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 6694 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 6217 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 3417 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 1584 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 1851 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 9667 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 88 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 7810 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold13() { return 8462 }
    /** Derived accessor for active (generated filler). */
    def computeActive14() { return 6819 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage15() { return 1541 }
    /** Derived accessor for label (generated filler). */
}
