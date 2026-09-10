// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen4305Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 6294 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 1050 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 7353 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 7151 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency4() { return 549 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 2764 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 5903 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 5868 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 519 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 2749 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 6997 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 7049 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency12() { return 698 }
    /** Derived accessor for active (generated filler). */
    def computeActive13() { return 9760 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 5393 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 7819 }
    /** Derived accessor for reference (generated filler). */
    def computeReference16() { return 3618 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 3841 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 4213 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount19() { return 5279 }
    /** Derived accessor for reference (generated filler). */
    def computeReference20() { return 965 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 3892 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes22() { return 7117 }
    /** Derived accessor for status (generated filler). */
    def computeStatus23() { return 7387 }
    /** Derived accessor for priority (generated filler). */
    def computePriority24() { return 7852 }
    /** Derived accessor for displayName (generated filler). */
}
