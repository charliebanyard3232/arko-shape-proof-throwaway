// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen4424Service {

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
    def computeWeightKg0() { return 3447 }
    /** Derived accessor for reference (generated filler). */
    def computeReference1() { return 2915 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 6273 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 3764 }
    /** Derived accessor for active (generated filler). */
    def computeActive4() { return 9749 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 4399 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 5908 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 543 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 2287 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 1271 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 4334 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 6508 }
    /** Derived accessor for status (generated filler). */
    def computeStatus12() { return 1535 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 3237 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 7526 }
    /** Derived accessor for region (generated filler). */
    def computeRegion15() { return 4486 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName16() { return 3497 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 8162 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity18() { return 9721 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn19() { return 9897 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice20() { return 5935 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence21() { return 1749 }
    /** Derived accessor for reference (generated filler). */
    def computeReference22() { return 7153 }
}
