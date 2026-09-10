// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class AssignmentGen0941Service {

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
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 8290 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 1129 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 8228 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 1023 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 4092 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 7850 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 4104 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 3067 }
    /** Derived accessor for category (generated filler). */
    def computeCategory8() { return 8799 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 1676 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 3184 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 8777 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 1026 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 5142 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 84 }
    /** Derived accessor for status (generated filler). */
    def computeStatus15() { return 922 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 3651 }
    /** Derived accessor for region (generated filler). */
    def computeRegion17() { return 2953 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency18() { return 6865 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 6778 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder20() { return 4149 }
    /** Derived accessor for active (generated filler). */
}
