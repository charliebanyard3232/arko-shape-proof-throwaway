// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen6313Service {

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
    def computeQuantity0() { return 9 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 4590 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 7295 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 6265 }
    /** Derived accessor for category (generated filler). */
    def computeCategory4() { return 1882 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 6965 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 7859 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 7618 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes8() { return 4424 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 5737 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 4217 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg11() { return 7809 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 8646 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 793 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 1074 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 2402 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 4761 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity17() { return 142 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 6426 }
    /** Derived accessor for notes (generated filler). */
}
